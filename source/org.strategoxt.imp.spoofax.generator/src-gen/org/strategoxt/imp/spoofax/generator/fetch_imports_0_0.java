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

@SuppressWarnings("all") public class fetch_imports_0_0 extends Strategy 
{ 
  public static fetch_imports_0_0 instance = new fetch_imports_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_imports_0_0");
    Fail25810:
    { 
      IStrategoTerm term10251 = term;
      IStrategoConstructor cons346 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10196:
      { 
        if(cons346 == SpoofaxGenerator._consModule_3)
        { 
          Fail25811:
          { 
            IStrategoTerm t_4263 = null;
            IStrategoTerm v_4263 = null;
            IStrategoTerm w_4263 = null;
            IStrategoTerm x_4263 = null;
            IStrategoTerm z_4263 = null;
            IStrategoTerm d_4264 = null;
            IStrategoTerm f_4264 = null;
            IStrategoTerm g_4264 = null;
            IStrategoTerm p_4264 = null;
            IStrategoTerm q_4264 = null;
            t_4263 = term.getSubterm(0);
            IStrategoTerm arg6222 = term.getSubterm(1);
            if(arg6222.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImports_1 != ((IStrategoAppl)arg6222).getConstructor())
              break Fail25811;
            z_4263 = arg6222.getSubterm(0);
            v_4263 = term.getSubterm(2);
            f_4264 = term;
            d_4264 = generator.const7145;
            g_4264 = f_4264;
            term = termFactory.makeTuple(generator.const7151, t_4263);
            term = dr_set_rule_0_3.instance.invoke(context, g_4264, d_4264, t_4263, term);
            if(term == null)
              break Fail25811;
            term = map_1_0.instance.invoke(context, z_4263, lifted9250.instance);
            if(term == null)
              break Fail25811;
            x_4263 = term;
            term = mapconcat_1_0.instance.invoke(context, term, lifted9252.instance);
            if(term == null)
              break Fail25811;
            term = termFactory.makeTuple(v_4263, term);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25811;
            w_4263 = term;
            term = filter_1_0.instance.invoke(context, x_4263, lifted9253.instance);
            if(term == null)
              break Fail25811;
            q_4264 = term;
            p_4264 = term;
            term = q_4264;
            IStrategoList list389;
            list389 = checkListTail(p_4264);
            if(list389 == null)
              break Fail25811;
            term = (IStrategoTerm)termFactory.makeListCons(z_4263, list389);
            term = concat_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25811;
            term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{t_4263, termFactory.makeAppl(SpoofaxGenerator._consImports_1, new IStrategoTerm[]{term}), w_4263});
            if(true)
              break Success10196;
          }
          term = term10251;
        }
        if(cons346 == SpoofaxGenerator._consModule_3)
        { 
          IStrategoTerm arg6229 = term.getSubterm(1);
          if(arg6229.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNoImports_0 != ((IStrategoAppl)arg6229).getConstructor())
            break Fail25810;
        }
        else
        { 
          break Fail25810;
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