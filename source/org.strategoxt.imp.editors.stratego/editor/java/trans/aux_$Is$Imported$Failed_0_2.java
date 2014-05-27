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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_4327, IStrategoTerm h_4327)
  { 
    Fail22208:
    { 
      IStrategoTerm i_4327 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22208;
      IStrategoTerm arg7973 = term.getSubterm(0);
      if(arg7973.getTermType() != IStrategoTerm.STRING || !"-26001".equals(((IStrategoString)arg7973).stringValue()))
        break Fail22208;
      i_4327 = term.getSubterm(1);
      term = i_4327;
      if(true)
        return term;
    }
    context.push("aux_IsImportedFailed_0_2");
    context.popOnFailure();
    return null;
  }
}