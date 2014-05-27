package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class annotate_project_location_0_0 extends Strategy 
{ 
  public static annotate_project_location_0_0 instance = new annotate_project_location_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("annotate_project_location_0_0");
    Fail22795:
    { 
      TermReference b_4615 = new TermReference();
      IStrategoTerm c_4615 = null;
      if(b_4615.value == null)
        b_4615.value = term;
      else
        if(b_4615.value != term && !b_4615.value.match(term))
          break Fail22795;
      term = context.invokePrimitive("LANG_get_all_projects_in_Workspace", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail22795;
      lifted6856 lifted68560 = new lifted6856();
      lifted68560.b_4615 = b_4615;
      term = filter_1_0.instance.invoke(context, term, lifted68560);
      if(term == null)
        break Fail22795;
      IStrategoTerm term12151 = term;
      Success12142:
      { 
        Fail22796:
        { 
          IStrategoTerm e_4615 = null;
          e_4615 = term;
          IStrategoTerm term12152 = term;
          Success12143:
          { 
            Fail22797:
            { 
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22797;
              IStrategoTerm arg8007 = ((IStrategoList)term).head();
              if(arg8007.getTermType() != IStrategoTerm.TUPLE || arg8007.getSubtermCount() != 2)
                break Fail22797;
              c_4615 = arg8007.getSubterm(1);
              IStrategoTerm arg8009 = ((IStrategoList)term).tail();
              if(arg8009.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8009).isEmpty())
                break Fail22797;
              { 
                if(true)
                  break Fail22796;
                if(true)
                  break Success12143;
              }
            }
            term = term12152;
          }
          term = e_4615;
          { 
            term = trans.const4466;
            if(c_4615 == null)
              c_4615 = term;
            else
              if(c_4615 != term && !c_4615.match(term))
                break Fail22795;
            if(true)
              break Success12142;
          }
        }
        term = term12151;
      }
      if(b_4615.value == null || c_4615 == null)
        break Fail22795;
      term = termFactory.annotateTerm(b_4615.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(c_4615, (IStrategoList)trans.constNil4)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}