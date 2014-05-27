package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Is$Imported$Failed_0_2 extends Strategy 
{ 
  public static aux_$Is$Imported$Failed_0_2 instance = new aux_$Is$Imported$Failed_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_4880, IStrategoTerm z_4880)
  { 
    Fail23684:
    { 
      IStrategoTerm a_4881 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23684;
      IStrategoTerm arg8440 = term.getSubterm(0);
      if(arg8440.getTermType() != IStrategoTerm.STRING || !"-26001".equals(((IStrategoString)arg8440).stringValue()))
        break Fail23684;
      a_4881 = term.getSubterm(1);
      term = a_4881;
      if(true)
        return term;
    }
    context.push("aux_IsImportedFailed_0_2");
    context.popOnFailure();
    return null;
  }
}