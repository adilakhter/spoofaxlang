package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Declaration$File_0_2 extends Strategy 
{ 
  public static aux_$Declaration$File_0_2 instance = new aux_$Declaration$File_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_92102, IStrategoTerm m_92102)
  { 
    Fail76267:
    { 
      IStrategoTerm n_92102 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76267;
      IStrategoTerm arg26220 = term.getSubterm(0);
      if(arg26220.getTermType() != IStrategoTerm.STRING || !"-36412".equals(((IStrategoString)arg26220).stringValue()))
        break Fail76267;
      n_92102 = term.getSubterm(1);
      term = n_92102;
      if(true)
        return term;
    }
    context.push("aux_DeclarationFile_0_2");
    context.popOnFailure();
    return null;
  }
}