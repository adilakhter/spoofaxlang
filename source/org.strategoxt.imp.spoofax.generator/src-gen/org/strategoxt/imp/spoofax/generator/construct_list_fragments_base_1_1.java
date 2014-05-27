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

@SuppressWarnings("all") public class construct_list_fragments_base_1_1 extends Strategy 
{ 
  public static construct_list_fragments_base_1_1 instance = new construct_list_fragments_base_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4541, IStrategoTerm q_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("construct_list_fragments_base_1_1");
    Fail25867:
    { 
      IStrategoTerm term10297 = term;
      Success10231:
      { 
        Fail25868:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail25868;
          term = generator.constNil7;
          if(true)
            break Success10231;
        }
        term = term10297;
        IStrategoTerm term10298 = term;
        Success10232:
        { 
          Fail25869:
          { 
            IStrategoTerm v_4272 = null;
            v_4272 = term;
            term = is_list_0_0.instance.invoke(context, v_4272);
            if(term == null)
              break Fail25869;
            term = construct_text_from_origin_1_1.instance.invoke(context, v_4272, p_4541, q_4541);
            if(term == null)
              break Fail25869;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
            if(true)
              break Success10232;
          }
          term = term10298;
          IStrategoTerm q_4272 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail25867;
          q_4272 = ((IStrategoList)term).head();
          IStrategoTerm arg6242 = ((IStrategoList)term).tail();
          if(arg6242.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6242).isEmpty())
            break Fail25867;
          term = construct_text_1_1.instance.invoke(context, q_4272, p_4541, q_4541);
          if(term == null)
            break Fail25867;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}