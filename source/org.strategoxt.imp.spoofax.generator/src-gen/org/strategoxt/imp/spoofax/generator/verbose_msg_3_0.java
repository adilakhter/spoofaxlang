package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class verbose_msg_3_0 extends Strategy 
{ 
  public static verbose_msg_3_0 instance = new verbose_msg_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4230, Strategy o_4230, Strategy p_4230)
  { 
    context.push("verbose_msg_3_0");
    Fail25531:
    { 
      IStrategoTerm m_4230 = null;
      m_4230 = term;
      lifted9079 lifted90790 = new lifted9079();
      lifted90790.n_4230 = n_4230;
      lifted90790.o_4230 = o_4230;
      lifted90790.p_4230 = p_4230;
      term = if_verbose2_1_0.instance.invoke(context, term, lifted90790);
      if(term == null)
        break Fail25531;
      term = m_4230;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}