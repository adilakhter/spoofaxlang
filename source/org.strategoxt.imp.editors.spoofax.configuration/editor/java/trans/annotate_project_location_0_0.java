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
    Fail87603:
    { 
      TermReference y_17558 = new TermReference();
      IStrategoTerm z_17558 = null;
      if(y_17558.value == null)
        y_17558.value = term;
      else
        if(y_17558.value != term && !y_17558.value.match(term))
          break Fail87603;
      term = context.invokePrimitive("LANG_get_all_projects_in_Workspace", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail87603;
      lifted24741 lifted247410 = new lifted24741();
      lifted247410.y_17558 = y_17558;
      term = filter_1_0.instance.invoke(context, term, lifted247410);
      if(term == null)
        break Fail87603;
      IStrategoTerm term47238 = term;
      Success47229:
      { 
        Fail87604:
        { 
          IStrategoTerm b_17559 = null;
          b_17559 = term;
          IStrategoTerm term47239 = term;
          Success47230:
          { 
            Fail87605:
            { 
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail87605;
              IStrategoTerm arg29982 = ((IStrategoList)term).head();
              if(arg29982.getTermType() != IStrategoTerm.TUPLE || arg29982.getSubtermCount() != 2)
                break Fail87605;
              z_17558 = arg29982.getSubterm(1);
              IStrategoTerm arg29984 = ((IStrategoList)term).tail();
              if(arg29984.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg29984).isEmpty())
                break Fail87605;
              { 
                if(true)
                  break Fail87604;
                if(true)
                  break Success47230;
              }
            }
            term = term47239;
          }
          term = b_17559;
          { 
            term = trans.const17853;
            if(z_17558 == null)
              z_17558 = term;
            else
              if(z_17558 != term && !z_17558.match(term))
                break Fail87603;
            if(true)
              break Success47229;
          }
        }
        term = term47238;
      }
      if(y_17558.value == null || z_17558 == null)
        break Fail87603;
      term = termFactory.annotateTerm(y_17558.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(z_17558, (IStrategoList)trans.constNil14)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}