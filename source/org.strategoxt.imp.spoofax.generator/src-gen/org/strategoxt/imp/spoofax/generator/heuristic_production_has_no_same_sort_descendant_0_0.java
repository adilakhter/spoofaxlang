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

@SuppressWarnings("all") public class heuristic_production_has_no_same_sort_descendant_0_0 extends Strategy 
{ 
  public static heuristic_production_has_no_same_sort_descendant_0_0 instance = new heuristic_production_has_no_same_sort_descendant_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("heuristic_production_has_no_same_sort_descendant_0_0");
    Fail26303:
    { 
      TermReference e_4327 = new TermReference();
      IStrategoTerm f_4327 = null;
      IStrategoTerm n_4327 = null;
      IStrategoTerm o_4327 = null;
      f_4327 = term;
      IStrategoTerm term10650 = term;
      Success10554:
      { 
        Fail26304:
        { 
          term = get_list_production_item_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26304;
          if(e_4327.value == null)
            e_4327.value = term;
          else
            if(e_4327.value != term && !e_4327.value.match(term))
              break Fail26304;
          if(true)
            break Success10554;
        }
        term = term10650;
        IStrategoTerm term10651 = term;
        IStrategoConstructor cons352 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success10555:
        { 
          if(cons352 == SpoofaxGenerator._consProdRule_2)
          { 
            Fail26305:
            { 
              IStrategoTerm c_4689 = null;
              IStrategoTerm arg6390 = term.getSubterm(0);
              if(arg6390.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6390).getConstructor())
                break Fail26305;
              c_4689 = arg6390.getSubterm(0);
              IStrategoTerm arg6391 = term.getSubterm(1);
              if(arg6391.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6391).isEmpty())
                break Fail26305;
              IStrategoTerm arg6392 = ((IStrategoList)arg6391).head();
              if(arg6392.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAppl_2 != ((IStrategoAppl)arg6392).getConstructor())
                break Fail26305;
              IStrategoTerm arg6395 = ((IStrategoList)arg6391).tail();
              if(arg6395.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6395).isEmpty())
                break Fail26305;
              term = c_4689;
              if(true)
                break Success10555;
            }
            term = term10651;
          }
          if(cons352 == SpoofaxGenerator._consProdRule_2)
          { 
            IStrategoTerm b_4689 = null;
            IStrategoTerm arg6396 = term.getSubterm(0);
            if(arg6396.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6396).getConstructor())
              break Fail26303;
            b_4689 = arg6396.getSubterm(0);
            IStrategoTerm arg6397 = term.getSubterm(1);
            if(arg6397.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6397).isEmpty())
              break Fail26303;
            IStrategoTerm arg6398 = ((IStrategoList)arg6397).head();
            if(arg6398.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg6398).getConstructor())
              break Fail26303;
            IStrategoTerm arg6400 = ((IStrategoList)arg6397).tail();
            if(arg6400.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6400).isEmpty())
              break Fail26303;
            term = b_4689;
          }
          else
          { 
            break Fail26303;
          }
        }
        if(e_4327.value == null)
          e_4327.value = term;
        else
          if(e_4327.value != term && !e_4327.value.match(term))
            break Fail26303;
      }
      o_4327 = f_4327;
      n_4327 = generator.const7489;
      term = o_4327;
      lifted9460 lifted94600 = new lifted9460();
      lifted94600.e_4327 = e_4327;
      term = dr_scope_1_1.instance.invoke(context, term, lifted94600, n_4327);
      if(term == null)
        break Fail26303;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}