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

@SuppressWarnings("all") public class constraint_error_0_0 extends Strategy 
{ 
  public static constraint_error_0_0 instance = new constraint_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("constraint_error_0_0");
    Fail22798:
    { 
      IStrategoTerm term12153 = term;
      IStrategoConstructor cons572 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12144:
      { 
        if(cons572 == Main._consSpxProjects_1)
        { 
          Fail22799:
          { 
            IStrategoTerm i_4615 = null;
            i_4615 = term.getSubterm(0);
            term = verify_project_references_0_0.instance.invoke(context, i_4615);
            if(term == null)
              break Fail22799;
            if(true)
              break Success12144;
          }
          term = term12153;
        }
        if(cons572 == Main._consSource_2)
        { 
          IStrategoTerm h_4615 = null;
          h_4615 = term.getSubterm(0);
          term = (IStrategoTerm)termFactory.makeListCons(h_4615, (IStrategoList)trans.constNil4);
          term = verify_local_directories_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22798;
        }
        else
        { 
          break Fail22798;
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