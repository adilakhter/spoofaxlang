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

@SuppressWarnings("all") public class main_pack_sdf_0_0 extends Strategy 
{ 
  public static main_pack_sdf_0_0 instance = new main_pack_sdf_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("main_pack_sdf_0_0");
    Fail25461:
    { 
      TermReference o_4220 = new TermReference();
      TermReference p_4220 = new TermReference();
      TermReference q_4220 = new TermReference();
      lifted9010 lifted90100 = new lifted9010();
      lifted90100.o_4220 = o_4220;
      lifted90100.p_4220 = p_4220;
      lifted90100.q_4220 = q_4220;
      term = xtc_io_wrap_2_0.instance.invoke(context, term, pack_sdf_options_0_0.instance, lifted90100);
      if(term == null)
        break Fail25461;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}