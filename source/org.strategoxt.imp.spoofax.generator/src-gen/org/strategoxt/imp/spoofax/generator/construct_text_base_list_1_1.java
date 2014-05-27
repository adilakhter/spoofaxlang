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

@SuppressWarnings("all") public class construct_text_base_list_1_1 extends Strategy 
{ 
  public static construct_text_base_list_1_1 instance = new construct_text_base_list_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4270, IStrategoTerm t_4270)
  { 
    context.push("construct_text_base_list_1_1");
    Fail25855:
    { 
      IStrategoTerm u_4270 = null;
      IStrategoTerm term10286 = term;
      Success10225:
      { 
        Fail25856:
        { 
          term = construct_list_fragments_base_1_1.instance.invoke(context, term, v_4270, t_4270);
          if(term == null)
            break Fail25856;
          if(true)
            break Success10225;
        }
        term = term10286;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail25855;
        u_4270 = ((IStrategoList)term).head();
        IStrategoTerm arg6239 = ((IStrategoList)term).tail();
        if(arg6239.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6239).isEmpty())
          break Fail25855;
        term = u_4270;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}