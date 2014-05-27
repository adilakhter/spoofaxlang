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

@SuppressWarnings("all") public class is_debug_call_0_0 extends Strategy 
{ 
  public static is_debug_call_0_0 instance = new is_debug_call_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_debug_call_0_0");
    Fail22729:
    { 
      IStrategoTerm term12132 = term;
      IStrategoConstructor cons584 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12131:
      { 
        if(cons584 == Main._consWhere_1)
        { 
          Fail22730:
          { 
            IStrategoTerm r_4718 = null;
            IStrategoTerm s_4718 = null;
            r_4718 = term;
            IStrategoTerm arg7962 = term.getSubterm(0);
            if(arg7962.getTermType() != IStrategoTerm.APPL || Main._consBA_2 != ((IStrategoAppl)arg7962).getConstructor())
              break Fail22730;
            s_4718 = arg7962.getSubterm(0);
            IStrategoTerm arg7963 = arg7962.getSubterm(1);
            if(arg7963.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)arg7963).getConstructor())
              break Fail22730;
            term = this.invoke(context, s_4718);
            if(term == null)
              break Fail22730;
            term = r_4718;
            if(true)
              break Success12131;
          }
          term = term12132;
        }
        Success12132:
        { 
          if(cons584 == Main._consWhere_1)
          { 
            Fail22731:
            { 
              IStrategoTerm p_4718 = null;
              IStrategoTerm q_4718 = null;
              p_4718 = term;
              IStrategoTerm arg7965 = term.getSubterm(0);
              if(arg7965.getTermType() != IStrategoTerm.APPL || Main._consBA_2 != ((IStrategoAppl)arg7965).getConstructor())
                break Fail22731;
              q_4718 = arg7965.getSubterm(0);
              IStrategoTerm arg7966 = arg7965.getSubterm(1);
              if(arg7966.getTermType() != IStrategoTerm.APPL || Main._consNoAnnoList_1 != ((IStrategoAppl)arg7966).getConstructor())
                break Fail22731;
              term = this.invoke(context, q_4718);
              if(term == null)
                break Fail22731;
              term = p_4718;
              if(true)
                break Success12132;
            }
            term = term12132;
          }
          Success12133:
          { 
            if(cons584 == Main._consWith_1)
            { 
              Fail22732:
              { 
                IStrategoTerm n_4718 = null;
                IStrategoTerm o_4718 = null;
                n_4718 = term;
                IStrategoTerm arg7968 = term.getSubterm(0);
                if(arg7968.getTermType() != IStrategoTerm.APPL || Main._consBA_2 != ((IStrategoAppl)arg7968).getConstructor())
                  break Fail22732;
                o_4718 = arg7968.getSubterm(0);
                IStrategoTerm arg7969 = arg7968.getSubterm(1);
                if(arg7969.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)arg7969).getConstructor())
                  break Fail22732;
                term = this.invoke(context, o_4718);
                if(term == null)
                  break Fail22732;
                term = n_4718;
                if(true)
                  break Success12133;
              }
              term = term12132;
            }
            Success12134:
            { 
              if(cons584 == Main._consWith_1)
              { 
                Fail22733:
                { 
                  IStrategoTerm l_4718 = null;
                  IStrategoTerm m_4718 = null;
                  l_4718 = term;
                  IStrategoTerm arg7971 = term.getSubterm(0);
                  if(arg7971.getTermType() != IStrategoTerm.APPL || Main._consBA_2 != ((IStrategoAppl)arg7971).getConstructor())
                    break Fail22733;
                  m_4718 = arg7971.getSubterm(0);
                  IStrategoTerm arg7972 = arg7971.getSubterm(1);
                  if(arg7972.getTermType() != IStrategoTerm.APPL || Main._consNoAnnoList_1 != ((IStrategoAppl)arg7972).getConstructor())
                    break Fail22733;
                  term = this.invoke(context, m_4718);
                  if(term == null)
                    break Fail22733;
                  term = l_4718;
                  if(true)
                    break Success12134;
                }
                term = term12132;
              }
              Success12135:
              { 
                if(cons584 == Main._consCallT_3)
                { 
                  Fail22734:
                  { 
                    IStrategoTerm arg7974 = term.getSubterm(0);
                    if(arg7974.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7974).getConstructor())
                      break Fail22734;
                    IStrategoTerm arg7975 = arg7974.getSubterm(0);
                    if(arg7975.getTermType() != IStrategoTerm.STRING || !"debug".equals(((IStrategoString)arg7975).stringValue()))
                      break Fail22734;
                    IStrategoList annos688 = arg7975.getAnnotations();
                    if(annos688.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos688).isEmpty())
                      break Fail22734;
                    IStrategoTerm arg7977 = ((IStrategoList)annos688).tail();
                    if(arg7977.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7977).isEmpty())
                      break Fail22734;
                    IStrategoTerm arg7979 = term.getSubterm(2);
                    if(arg7979.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7979).isEmpty())
                      break Fail22734;
                    if(true)
                      break Success12135;
                  }
                  term = term12132;
                }
                Success12136:
                { 
                  if(cons584 == Main._consWhere_1)
                  { 
                    Fail22735:
                    { 
                      IStrategoTerm arg7980 = term.getSubterm(0);
                      if(arg7980.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)arg7980).getConstructor())
                        break Fail22735;
                      IStrategoTerm arg7981 = arg7980.getSubterm(0);
                      if(arg7981.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7981).getConstructor())
                        break Fail22735;
                      IStrategoTerm arg7982 = arg7981.getSubterm(0);
                      if(arg7982.getTermType() != IStrategoTerm.STRING || !"debug".equals(((IStrategoString)arg7982).stringValue()))
                        break Fail22735;
                      IStrategoList annos689 = arg7982.getAnnotations();
                      if(annos689.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos689).isEmpty())
                        break Fail22735;
                      IStrategoTerm arg7984 = ((IStrategoList)annos689).tail();
                      if(arg7984.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7984).isEmpty())
                        break Fail22735;
                      IStrategoTerm arg7986 = arg7980.getSubterm(2);
                      if(arg7986.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7986).isEmpty())
                        break Fail22735;
                      if(true)
                        break Success12136;
                    }
                    term = term12132;
                  }
                  if(cons584 == Main._consWith_1)
                  { 
                    IStrategoTerm arg7987 = term.getSubterm(0);
                    if(arg7987.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)arg7987).getConstructor())
                      break Fail22729;
                    IStrategoTerm arg7988 = arg7987.getSubterm(0);
                    if(arg7988.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7988).getConstructor())
                      break Fail22729;
                    IStrategoTerm arg7989 = arg7988.getSubterm(0);
                    if(arg7989.getTermType() != IStrategoTerm.STRING || !"debug".equals(((IStrategoString)arg7989).stringValue()))
                      break Fail22729;
                    IStrategoList annos690 = arg7989.getAnnotations();
                    if(annos690.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos690).isEmpty())
                      break Fail22729;
                    IStrategoTerm arg7991 = ((IStrategoList)annos690).tail();
                    if(arg7991.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7991).isEmpty())
                      break Fail22729;
                    IStrategoTerm arg7993 = arg7987.getSubterm(2);
                    if(arg7993.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7993).isEmpty())
                      break Fail22729;
                  }
                  else
                  { 
                    break Fail22729;
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