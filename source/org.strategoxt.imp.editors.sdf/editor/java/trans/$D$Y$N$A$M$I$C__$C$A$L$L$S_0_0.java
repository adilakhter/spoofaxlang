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

@SuppressWarnings("all") public class $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0 extends Strategy 
{ 
  public static $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0 instance = new $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DYNAMIC__CALLS_0_0");
    Fail76105:
    { 
      IStrategoTerm term41879 = term;
      Success41799:
      { 
        Fail76106:
        { 
          IStrategoTerm w_92076 = null;
          w_92076 = term;
          term = undefine_$Current$File_0_1.instance.invoke(context, w_92076, trans.const15485);
          if(term == null)
            break Fail76106;
          if(true)
            break Success41799;
        }
        term = term41879;
        IStrategoTerm term41880 = term;
        Success41800:
        { 
          Fail76107:
          { 
            IStrategoTerm u_92076 = null;
            u_92076 = term;
            term = undefine_$Is$Imported_0_1.instance.invoke(context, u_92076, trans.const15485);
            if(term == null)
              break Fail76107;
            if(true)
              break Success41800;
          }
          term = term41880;
          IStrategoTerm term41881 = term;
          Success41801:
          { 
            Fail76108:
            { 
              IStrategoTerm s_92076 = null;
              s_92076 = term;
              term = undefine_$Project$Dir_0_1.instance.invoke(context, s_92076, trans.const15485);
              if(term == null)
                break Fail76108;
              if(true)
                break Success41801;
            }
            term = term41881;
            IStrategoTerm term41882 = term;
            Success41802:
            { 
              Fail76109:
              { 
                IStrategoTerm q_92076 = null;
                q_92076 = term;
                term = undefine_$Current$Dir_0_1.instance.invoke(context, q_92076, trans.const15485);
                if(term == null)
                  break Fail76109;
                if(true)
                  break Success41802;
              }
              term = term41882;
              IStrategoTerm term41883 = term;
              Success41803:
              { 
                Fail76110:
                { 
                  IStrategoTerm o_92076 = null;
                  o_92076 = term;
                  term = undefine_$Is$Import$Failed_0_1.instance.invoke(context, o_92076, trans.const15485);
                  if(term == null)
                    break Fail76110;
                  if(true)
                    break Success41803;
                }
                term = term41883;
                IStrategoTerm term41884 = term;
                Success41804:
                { 
                  Fail76111:
                  { 
                    IStrategoTerm m_92076 = null;
                    m_92076 = term;
                    term = undefine_$Declaration$File_0_1.instance.invoke(context, m_92076, trans.const15485);
                    if(term == null)
                      break Fail76111;
                    if(true)
                      break Success41804;
                  }
                  term = term41884;
                  IStrategoTerm term41885 = term;
                  Success41805:
                  { 
                    Fail76112:
                    { 
                      IStrategoTerm k_92076 = null;
                      k_92076 = term;
                      term = undefine_$Declaration_0_1.instance.invoke(context, k_92076, trans.const15485);
                      if(term == null)
                        break Fail76112;
                      if(true)
                        break Success41805;
                    }
                    term = term41885;
                    IStrategoTerm i_92076 = null;
                    i_92076 = term;
                    term = undefine_$Usage_0_1.instance.invoke(context, i_92076, trans.const15485);
                    if(term == null)
                      break Fail76105;
                  }
                }
              }
            }
          }
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